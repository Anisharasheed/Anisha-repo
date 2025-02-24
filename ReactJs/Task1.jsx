<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script crossorigin src="https://unpkg.com/react@18/umd/react.development.js"></script>
<script crossorigin src="https://unpkg.com/react-dom@18/umd/react-dom.development.js"></script>
<script src="https://unpkg.com/@babel/standalone/babel.min.js"></script>

</head>
<body>
    <div id="div1"></div>
    <div id ="div2"></div>
    <div id = "div3"></div>
    <script type="text/babel">
       ReactDOM.createRoot(document.getElementById('div1')).render(<h2>Hellloo Anisha</h2>);
       ReactDOM.createRoot(document.getElementById('div2')).render(<h4>How are you today?</h4>);
       ReactDOM.createRoot(document.getElementById('div3')).render(<p>I hope you are Fine:)</p>);
    </script>
</body>
</html>
