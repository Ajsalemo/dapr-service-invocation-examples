import { Router } from "express";

const router = Router();

export const apiController = router.get("/", (_req, res) => {
  try {
    const carsArray = ["BMW", "Audi", "Porsche", "VW", "Toyota", "Honda"];
    res.json({ msg: carsArray });
  } catch (error) {
    console.log(error);
  }
});
