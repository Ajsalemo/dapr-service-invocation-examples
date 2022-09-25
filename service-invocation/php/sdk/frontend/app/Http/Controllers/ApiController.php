<?php

namespace App\Http\Controllers;

class ApiController extends Controller
{
    public function apiController(\Dapr\Client\DaprClient $client)
    {
        $res = $client->invokeMethod('GET', new \Dapr\Client\AppId('backend'), "api/cars/get")
        ->getBody()
        ->getContents();

        return view('api', ['data' => $res]);
    }
}