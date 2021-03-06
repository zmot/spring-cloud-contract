package contracts.dynamicWord

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/word/dynamic'

        headers {
            header('Content-Type', 'application/word.v1+json')
        }
    }
    response {
        status 200
        body("""
  {
    "word": "MOCKED"
  }
  """)
    }
}