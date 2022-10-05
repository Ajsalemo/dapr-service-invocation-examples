using Microsoft.AspNetCore.Mvc;
using Microsoft.Net.Http.Headers;

namespace frontend.Controllers;

[ApiController]
[Route("/")]
public class IndexController : ControllerBase
{
    [HttpGet(Name = "Index")]
    public string OnGet()
    {
        var message = "dotnet-service-invocation-http-frontend";
        
        return message;
    }
}
