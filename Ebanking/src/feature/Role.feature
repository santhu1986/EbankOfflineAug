Feature: Role Creation

Scenario Outline: Verify Role Creation with Multiple Sets of Data

Given Tester Should on Ranford HP

When Tester Enters Login Details

Then Tester click on Role button

When Tester click on New Role and enters "<RoleName>" and "<RoleType>"

Then Tester close the Application

Examples:

        | RoleName | RoleType |
        | teller | E |
        | manager | E |
        | GenManager | E |