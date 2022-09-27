<?php

namespace App\Http\Controllers;

use Dapr\Client\DaprClient;
use Dapr\Client\AppId;

class ApiController extends Controller
{
    public function apiController()
    {
        $client = DaprClient::clientBuilder()->build();
        $appId = new AppId('backend');
        $res = $client->invokeMethod('GET', $appId, "api/cars/get")
        ->getBody()
        ->getContents();
        echo($res);
        return view('api', ['data' => json_encode($res)]);
    }
}