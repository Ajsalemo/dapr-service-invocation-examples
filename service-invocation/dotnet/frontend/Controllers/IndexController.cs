using Microsoft.AspNetCore.Mvc;
using Microsoft.Net.Http.Headers;

namespace frontend.Controllers;

[ApiController]
[Route("/")]
public class IndexController : ControllerBase
{
    private readonly IHttpClientFactory _httpClientFactory;

    public IndexController(IHttpClientFactory httpClientFactory) =>
        _httpClientFactory = httpClientFactory;

    [HttpGet(Name = "Index")]
    public string OnGet()
    {
        var message = "dotnet-service-invocation-http-frontend";
        
        return message;
    }
}
