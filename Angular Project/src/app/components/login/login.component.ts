import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginForm: FormGroup;

  constructor(private fb: FormBuilder, private router: Router) {
    this.loginForm = this.fb.group({
      username: [''],
      password: ['']
    });
  }

  login() {
    const { username, password } = this.loginForm.value;
  
    if (username === 'anisha' && password === '1234') {
      localStorage.setItem('user', username);  
      this.router.navigate(['/home']);  
    } else {
      alert('Invalid Credentials! Use: anisha / 1234');
    }
  }
  
  }

