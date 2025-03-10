import { Component, OnInit } from '@angular/core';
import { FoodService } from '../../services/food.service';

@Component({
  selector: 'app-food-list',
  templateUrl: './food-list.component.html',
  styleUrls: ['./food-list.component.css']
})
export class FoodListComponent implements OnInit {
  reviews: any[] = [];
  filteredReviews: any[] = []; // ✅ Fix: Add this variable

  constructor(private foodService: FoodService) {}

  ngOnInit() {
    this.foodService.getReviews().subscribe(data => {
      console.log("Fetched Reviews:", data); // Debugging
      this.reviews = data;
      this.filteredReviews = data; // ✅ Show all reviews by default
    });
  }

  filterReviews(foodType: string) { // ✅ Fix: Add this function
    if (foodType === 'all') {
      this.filteredReviews = this.reviews;
    } else {
      this.filteredReviews = this.reviews.filter(review => review.food.includes(foodType));
    }
  }
}
