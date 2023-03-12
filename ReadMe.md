

This Demo Is Using Jwt Auth + Basic Auth That came With Spring Security

How To Use ?
# Run your server
# Open postman
# Visit localhost:8080 or if you have custom port you can use it
# The Respond will be 401 Unauthorized
# That mean you have to login wth Basic auth using the given credential below
# To get token you can send post request to localhost:8080/token
# This will give you a token that will be valid for 1 hour
# Now you can use token to visit url like localhost:8080
# The response of this api will hi , admin
