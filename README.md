# dapr-service-invocation-examples
Various scenarios using Dapr and [Service Invocation](https://docs.dapr.io/developing-applications/building-blocks/service-invocation/service-invocation-overview/). This is designed to be ran locally on Kubernetes clusters and also deployed to Azure Container Apps with an ARM template.

About this repo:
- Each language has a folder named `http` and `sdk`. The `http` folder uses an HTTP client with Dapr to call the "backend" API. The `sdk` folder uses the language specific Dapr SDK to call the "backend" API
- Each `http` and `sdk` folder has a `frontend` and `backend` folder. The "frontend" acts as the client and the "backend" acts as the API. 
- Each `frontend` and `backend` folder has a `Dockerfile`. Build this to run the examples. 
- The examples are designed so that the `frontend` calls the `backend` of the respective sample.
- To run this locally, build the Docker image and use the `local` folder to deploy to a local Kubernetes cluster
- To run this on Azure, build the Docker image and deploy this with the commands in the `deploy` folder -> `commands.txt` file.