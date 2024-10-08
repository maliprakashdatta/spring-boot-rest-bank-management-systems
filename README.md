# REST Service Demo with Spring Boot

This example demonstrates how you can implement REST service in Spring Boot.

### Technical Details
In this project, we are going to use below set of versions for demonstrations.

    Spring Boot - 3.3.3
    Spring - 6.1.12
    Lombok - 1.18.34

### Building

The example can be built with
```shell
mvn clean install
```

### Running the example in your local
```shell
mvn clean spring-boot:run
```

### Test your front-end against a real API, Only for demo purpose 
```shell
https://reqres.in/
```
### Send message to application with the help of demo REST API
Update the message in below common while posting multiple messages.

Add Few entries first to have smooth experience
```shell
curl --location 'http://localhost:8081/card-management/card' "{\"cardId\" : 1, \"cardNo\" : \"101\", \"accountNo\" : 1001, \"accountHolderName\" : \"Prakash Mali\" \"cvv\" : \"1\"  \"cardType\" : \"debit\" }"
```
### card form
### card GET Request:

```shell
curl --location --request GET 'http://localhost:8081/bank-management/card' \
--header 'Content-Type: application/json' \
--data '{
    "cardId": 0,
    "cardNo": "1",
    "accountNo": "123",
    "accountHolderName": "Prakash",
    "cvv": "11",
    "cardType": "debit"
}

'
```

### POST Request:
```shell
1)com.swsa.domain.Card@742813c8
2)curl --location 'http://localhost:8081/bank-management/card' \
--header 'Content-Type: application/json' \
--data '{
    "cardId": 0,
    "cardNo": "1",
    "accountNo": "123",
    "accountHolderName": "Prakash",
    "cvv": "11",
    "cardType": "debit"
}
'
```
 
### Card Screen Output:
<image src="https://github.com/user-attachments/assets/bf46790a-d227-4098-a33d-b92204ba2c28" width="750" height="350">
    
### customer form
### customer POST Request:
```shell
curl --location 'http://localhost:8081/bank-management/customer' \
--header 'Content-Type: application/json' \
--data-raw ' {
    "customerId":"1",
   "name":"Prakash Mali",
    "mobileNo":"1234567891",
     "address":"Jath",
    "emailId":"maliprakash@gmail.com",
  "aadhaarNo":"12233234"
   
   }
'
   
   }
'
```
### customer GET Request:
```shell
curl --location --request GET 'http://localhost:8081/bank-management/customer' \
--header 'Content-Type: application/json' \
--data-raw ' {
    "customerId":"0",
   "name":"Prakash Mali",
    "mobileNo":"1234567891",
     "address":"Jath",
    "emailId":"maliprakash@gmail.com",
  "aadhaarNo":"12233234"
   
   }
'
   
   }
'
'
```
### customer Screen Output:

<image src="https://github.com/user-attachments/assets/21004d36-8a97-496a-9a24-156ca6104fee" width="750" height="350">

<hr>

### account form
### account POST Request:
```shell
curl --location 'http://localhost:8081/bank-management/deposit' \
--header 'Content-Type: application/json' \
--data '{
   "accountNumber":1,
    "accountHolderName":"Nirav",
     "balance":"3000",
     "customer":1
}'
```
### account GET Request:
```shell
curl --location --request GET 'http://localhost:8081/bank-management/account' \
--header 'Content-Type: application/json' \
--data '{
   "accountNumber":1,
    "accountHolderName":"Nirav",
     "balance":"3000",
     "customer":1
}'
```

### account Screen Output:

<image src="https://github.com/user-attachments/assets/31003ad0-bb77-4a82-bb17-ea3cb0011885" width="750" height="350">


### account deposit form
### account deposit GET Request:
```shell
curl --location --request GET 'http://localhost:8081/bank-management/deposit' \
--header 'Content-Type: application/json' \
--data '{
   "accountNumber":1,
    "accountHolderName":"Nirav",
     "balance":"6000",
     "customer":1
}'
```
### deposit POST Request:
```shell
curl --location 'http://localhost:8081/bank-management/deposit' \
--header 'Content-Type: application/json' \
--data '{
   "accountNumber":1,
    "accountHolderName":"Nirav",
     "balance":"6000",
     "customer":1
}'
```

### account deposit Screen Output:

<image src="https://github.com/user-attachments/assets/1577ab8b-57cc-46f5-85b5-2dce68e511f3" width="750" height="350">



### account withdraw form
### account withdraw POST Request:
```shell
curl --location 'http://localhost:8081/bank-management/withdraw' \
--header 'Content-Type: application/json' \
--data '{
    "accountNumber":1,
    "accountHolderName":"nirav",
     "balance":"2000",
     "customer":1
}'
```
### account withdraw GET Request:
```shell
curl --location --request GET 'http://localhost:8081/bank-management/withdraw' \
--header 'Content-Type: application/json' \
--data '{
    "accountNumber":"1",
    "accountHolderName":"nirav",
     "balance":"2000",
     "customer":1
}'
```
### account withdraw Screen Output:

<image src="https://github.com/user-attachments/assets/b8ea201d-fb6d-4310-b693-a58b4a409490" width="750" height="350">





