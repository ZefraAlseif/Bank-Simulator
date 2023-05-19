## Getting Started
Bank Simulator will serve as an online bank that will implement the options offered at a new bank
- Create an account with the bank: `class createAccount`
    - Name, Address, Phone #, (other parameters will be ignored for this design i.e SSN)
        - Assume unique hashCode means unique Account 
    - Bank will provide you with a Randomized unique account #, expiration date and CSV 
    - It will have an encryption key to encode the account #
    - Allow for the User to create a Pin for their account Number
- Allow the User to Make transactions: `class Transactions` 
    - Withdraw Money from the bank
    - Deposit Money in the Bank
    - Check Current Balance
    - Transfers from one individual to another via the usage of the Name & Phone #
    - Bank Account Statements
- Report `class Reports`
    - Show all the accounts that have been created and their Name, Address, Phone # and Balance

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
