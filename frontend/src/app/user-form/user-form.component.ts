import { Component } from '@angular/core';
import {User} from "../user";
import {ActivatedRoute, Router} from "@angular/router";
import {UserServiceService} from "../user-service.service";

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrl: './user-form.component.css'
})
export class UserFormComponent {

  user: User;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserServiceService) {
    this.user = new User();
  }

  onSubmit() {
    this.userService.save(this.user).subscribe({
      next: (result) => this.gotoUserList(),
      error: (error) => alert('Failed to save user: ' + error.message)
    });
  }


  gotoUserList() {
    this.router.navigate(['/users']);
  }
}
