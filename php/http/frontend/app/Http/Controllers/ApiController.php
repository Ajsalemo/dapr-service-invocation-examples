<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;

class ApiController extends Controller
{
    public function apiController()
    {
        $res = Http::get('http://localhost:3500/v1.0/invoke/backend/method/api/cars/get');
        return view('api', ['data' => $res->json()]);
    }
}
