# Java Spring Boot Demo

The project is based on a small web service which uses the following technologies:

* Java 17.0.9
* Spring MVC with Spring Boot (version 3.2.1)
* Gradle

## How to start the app

You should be able to start the example application by executing com.togadiya.UmangApplication, which starts a webserver on port 8080 (http://localhost:8080/).

```bash
http://localhost:8080/
```

## API's
#### String
```
http://localhost:8080/string - GET
// return string "Umang Togadiya"
````
#### Object
```
http://localhost:8080/object - GET
// return string { "name": "umang", "email": "umang@gmail.com" }
````
#### Array
```
http://localhost:8080/array - GET
// return Array [
  {
    "name": "John",
    "email": "john@gmail.com"
  },
  {
    "name": "Alice",
    "email": "alice@gmail.com"
  },
  {
    "name": "Bob",
    "email": "bob@gmail.com"
  }
]

````

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
