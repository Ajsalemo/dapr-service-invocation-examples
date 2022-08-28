import { Router } from "express";
import axios from "axios";

const router = Router();

export const apiController = router.get("/", async (_req, res) => {
  try {
    const { data } = await axios.get("http://localhost:3500/v1/invoke/backend/method/api/cars/get");
    res.json({ msg: data });
  } catch (error) {
    console.log(error);
  }
});
