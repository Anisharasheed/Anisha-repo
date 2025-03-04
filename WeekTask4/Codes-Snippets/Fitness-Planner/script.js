document.addEventListener("DOMContentLoaded", function () {
    setupDarkMode();

    if (document.getElementById("routine-list")) {
        loadRoutine();
    } else if (document.getElementById("saved-routine-list")) {
        loadSavedRoutines();
    } else if (document.getElementById("progressChart")) {
        loadProgressChart();
    }
});

function setupDarkMode() {
    let toggleButton = document.createElement("button");
    toggleButton.textContent = "Dark Mode";
    toggleButton.style.position = "fixed";
    toggleButton.style.top = "10px";
    toggleButton.style.right = "10px";
    toggleButton.style.padding = "10px";
    toggleButton.style.borderRadius = "10px";
    toggleButton.style.cursor = "pointer";
    document.body.appendChild(toggleButton);

    if (localStorage.getItem("darkMode") === "enabled") {
        document.body.classList.add("dark-mode");
    }

    toggleButton.addEventListener("click", function () {
        document.body.classList.toggle("dark-mode");

        if (document.body.classList.contains("dark-mode")) {
            localStorage.setItem("darkMode", "enabled");
        } else {
            localStorage.setItem("darkMode", "disabled");
        }
    });
}

function addExercise() {
    let exerciseInput = document.getElementById("exercise");
    let durationInput = document.getElementById("duration");
    let exercise = exerciseInput.value;
    let duration = durationInput.value;

    if (exercise === "" || duration === "") {
        alert("Please enter exercise name and duration!");
        return;
    }

    let routineList = document.getElementById("routine-list");
    let listItem = document.createElement("li");
    listItem.textContent = `${exercise} - ${duration} min`;
    routineList.appendChild(listItem);

    exerciseInput.value = "";
    durationInput.value = "";
}

function saveRoutine() {
    let routineItems = [];
    document.querySelectorAll("#routine-list li").forEach(item => {
        routineItems.push(item.textContent);
    });

    localStorage.setItem("workoutRoutine", JSON.stringify(routineItems));
    alert("Routine saved successfully!");
}

function loadRoutine() {
    let savedRoutine = localStorage.getItem("workoutRoutine");
    if (savedRoutine) {
        let routineList = document.getElementById("routine-list");
        let exercises = JSON.parse(savedRoutine);
        exercises.forEach(exercise => {
            let listItem = document.createElement("li");
            listItem.textContent = exercise;
            routineList.appendChild(listItem);
        });
    }
}

function loadSavedRoutines() {
    let savedRoutine = localStorage.getItem("workoutRoutine");
    if (savedRoutine) {
        let savedRoutineList = document.getElementById("saved-routine-list");
        let exercises = JSON.parse(savedRoutine);
        exercises.forEach(exercise => {
            let listItem = document.createElement("li");
            listItem.textContent = exercise;
            savedRoutineList.appendChild(listItem);
        });
    } else {
        document.getElementById("saved-routine-list").innerHTML = "<p>No routines saved yet.</p>";
    }
}

function loadProgressChart() {
    let savedRoutine = localStorage.getItem("workoutRoutine");
    if (savedRoutine) {
        let exercises = JSON.parse(savedRoutine);
        let labels = [];
        let durations = [];

        exercises.forEach(exercise => {
            let parts = exercise.split(" - ");
            labels.push(parts[0]);
            durations.push(parseInt(parts[1]));
        });

        let ctx = document.getElementById("progressChart").getContext("2d");
        new Chart(ctx, {
            type: "bar",
            data: {
                labels: labels,
                datasets: [{
                    label: "Workout Duration (mins)",
                    data: durations,
                    backgroundColor: "rgba(255, 99, 132, 0.6)",
                    borderColor: "rgba(255, 99, 132, 1)",
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true,
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });
    } else {
        document.getElementById("progressChart").outerHTML = "<p>No progress data available.</p>";
    }
}
