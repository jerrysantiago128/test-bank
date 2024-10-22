Functional Requirements:

3.1 Account Management
  3.1.1 The system shall allow users to create, view, and close accounts.
  3.1.2 The system shall allow users to view account balances and transaction histories.
  3.1.3 The system shall support different account types: savings, checking, and business accounts.
  3.1.4 The system shall ensure user authentication and authorization through secure login mechanisms (e.g., two-factor authentication).

5.1 Data Types
  Accounts: A record for each customer, including account number (integer), balance (float), and account type (String).
  HashMap<String, Account>: For fast access to customer account information based on account number.
