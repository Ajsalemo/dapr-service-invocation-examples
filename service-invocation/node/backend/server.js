import express from "express";
import { homeController } from "./controllers/homeController.js";
import { apiController } from "./controllers/apiController.js";

const app = express();
const port = process.env.PORT || 3000;

app.use(homeController);
app.use("/api/cars/get", apiController);

app.listen(port, () => console.log(`Server is listening on port ${port}`));
