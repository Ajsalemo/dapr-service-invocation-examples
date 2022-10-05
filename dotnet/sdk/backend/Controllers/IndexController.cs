using Microsoft.AspNetCore.Mvc;

namespace backend.Controllers;

[ApiController]
[Route("/")]
public class IndexController : ControllerBase
{
    [HttpGet(Name = "Index")]
    public string OnGet()
    {
        var message = "dotnet-service-invocation-sdk-backend";
        
        return message;
    }
}
