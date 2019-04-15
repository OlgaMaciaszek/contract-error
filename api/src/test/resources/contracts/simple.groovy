package contracts

org.springframework.cloud.contract.spec.Contract.make {
    name("Simple API call")
    description()
    request {
        method 'GET'
        url '/api/v1/simple'
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body(file("simpleResponse.json"))
        headers {
            contentType('application/json')
        }
    }
}