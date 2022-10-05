import { DaprClient, HttpMethod } from "@dapr/dapr";
import { Router } from "express";

const router = Router();
const daprHost = "http://localhost"; 
const daprPort = "3500"; 
const serviceAppId = "backend";
const serviceMethod = "api/cars/get";
const client = new DaprClient(daprHost, daprPort); 

export const apiController = router.get("/", async (_req, res) => {
  try {
    const response = await client.invoker.invoke(serviceAppId, serviceMethod, HttpMethod.GET);
    console.log(response)
    res.json({ msg: response });
  } catch (error) {
    console.log(error);
  }
});
