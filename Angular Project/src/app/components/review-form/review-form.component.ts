import { Component } from '@angular/core';
import { FoodService } from '../../services/food.service';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrls: ['./review-form.component.css']
})
export class ReviewFormComponent {
  reviewForm: FormGroup;

  constructor(private fb: FormBuilder, private foodService: FoodService) {
    this.reviewForm = this.fb.group({
      restaurant: [''],
      food: [''],
      rating: [''],
      review: ['']
    });
  }

  submitReview() {
    this.foodService.addReview(this.reviewForm.value).subscribe(() => {
      alert('Review added successfully!');
      this.reviewForm.reset();
    });
  }
}