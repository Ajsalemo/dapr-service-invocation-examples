<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ApiController extends Controller
{
    public function getCars()
    {
        $carsArr = array(
            "BMW",
            "Audi",
            "Porsche",
            "Mercedes-benz",
            "VW"
        );

        return $carsArr;
    }
}
