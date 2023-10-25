def deployToEnvironment(String environment) {

  if (environment == 'PROD') {

            printIn("Deploying to production")
  }
  else
  {
             printIn("Deploying to testing")
  }

}

return this
