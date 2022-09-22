<?php

namespace App\Http\Controllers;

class ServiceInvocationController extends Controller
{
    public function serviceInvocationController(\Dapr\Client\DaprClient $client)
    {
        $res = $client->invokeMethod('GET', new \Dapr\Client\AppId('backend'), "api/cars/get")
        ->getBody()
        ->getContents();

        return view('api', ['data' => $res]);
    }
}