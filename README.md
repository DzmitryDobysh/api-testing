# Practical Task

https://learn.epam.com/learning-piece/sharing?rootId=2576044&itemId=2576055

## Home Task

1. Create a test to verify a http status code:
    - Send the http request by using the GET method.
    - The URL is https://jsonplaceholder.typicode.com/users
    - Validation: status code of the obtained response is 200 OK
2. Create a test to verify a http response header:
    - Send the http request by using the GET method.
    - The URL is https://jsonplaceholder.typicode.com/users
    - Validation: - the content-type header exists in the obtained response
      - the value of the content-type header is application/json; charset=utf-8
3. Create a test to verify a http response body:
    - Send the http request by using the GET method:
    - The URL is https://jsonplaceholder.typicode.com/users
    - Validation: the content of the response body is the array of 10 users
