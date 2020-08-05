ANZ Wholesale Engineering Sample Project Rest APIs Connecting to MySQL

Runs on port 5000

Run .com.wholesale.engineering.samraat.sample.project.Application as a Java Application.



## URLS


List Accounts
- http://localhost:8080/services/accounts

```json
[
    {
        "accountNumber": "123-2223-212",
        "accountName": "SGSavings726",
        "accountType": "Savings",
        "currecyVal": "SGD",
        "balance": 84565.20,
        "transactionDate": "2020-08-04"
    },
    {
        "accountNumber": "123-2223-213",
        "accountName": "USSavings727",
        "accountType": "Current",
        "currecyVal": "USD",
        "balance": 74565.20,
        "transactionDate": "2020-08-04"
    },
    {
        "accountNumber": "123-2223-214",
        "accountName": "AUSavings728",
        "accountType": "Savings",
        "currecyVal": "AUD",
        "balance": 94565.20,
        "transactionDate": "2020-08-04"
    }
]
```


List Transactions for Account # 123-2223-214

- http://localhost:8080/services/transactions/123-2223-214

```json
[
    {
        "transactionID": 10006,
        "accountNumber": "123-2223-214",
        "accountType": "Savings",
        "valueDate": "2020-08-04",
        "currecyVal": "AUD",
        "transactionType": "Credit",
        "amountDebit": null,
        "amountCredit": 5000.00,
        "transactionDes": "Wholesale Credit"
    }
]
```

List Transactions for Invalid Account # 123-2223-215

- http://localhost:8080/services/transactions/123-2223-215

```json
{
    "timestamp": "2020-08-05T08:08:32.340+00:00",
    "message": "No Transactions Found",
    "details": "uri=/services/transactions/123-2223-215"
}
```



## H2 Console

- http://localhost:5000/h2-console
- Use `jdbc:h2:mem:testdb` as JDBC URL 

