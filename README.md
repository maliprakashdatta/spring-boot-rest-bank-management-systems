# REST Service Demo with Spring Boot

This example demonstrates how you can implement REST service in Spring Boot.

### Technical Details
In this project, we are going to use below set of versions for demonstrations.

    Spring Boot - 3.3.3
    Spring - 6.1.12
    Lombok - 1.18.30

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
1)com.swsa.domain.Card@6e64b8bf
2)curl --location 'http://localhost:8081/bank-management/card' \
--header 'Content-Type: application/json' \
--data '{
    "cardId": "0",
    "cardNo": "1",
    "accountNo": "123",
    "accountHolderName": "Prakash",
    "cvv": "11",
    "cardType": "debit"
}
'
```
 
### Card Screen Output:
<image src="https://github.com/user-attachments/assets/617577ed-11a6-46eb-9a1e-9cd9ca9cdb0a" width="750" height="350">
    
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
curl --location 'http://localhost:8081/bank-management/account' \
--header 'Content-Type: application/json' \
--data '{
   "accountNumber":"1",
    "accountHolderName":"Prakash",
     "balance":"1000",
     "customer":"1"
}'
```
### account GET Request:
```shell
curl --location --request GET 'http://localhost:8081/bank-management/account' \
--header 'Content-Type: application/json' \
--data '{
   "accountNumber":"1",
    "accountHolderName":"Prakash",
     "balance":"1000",
     "customer":"1"
}'
```

### account Screen Output:

<image src="https://github.com/user-attachments/assets/8a20d0c1-9438-4cf7-94be-a1cc23b5f55f" width="750" height="350">


### account deposit form
### account deposit GET Request:
```shell
curl --location --request GET 'http://localhost:8081/bank-management/deposit' \
--header 'Content-Type: application/json' \
--data '{
    "accountNumber":"2",
    "accountHolderName":"pramod",
     "balance":"500000",
     "customer":"1"
}'
```
### deposit POST Request:
```shell
curl --location 'http://localhost:8081/bank-management/deposit' \
--header 'Content-Type: application/json' \
--data '{
    "accountNumber":"2",
    "accountHolderName":"pramod",
     "balance":"500000",
     "customer":"1"
}'
```

### account deposit Screen Output:

<image src="https://github.com/user-attachments/assets/9ab7a8a1-11b4-4506-927b-94630694b4d4" width="750" height="350">


