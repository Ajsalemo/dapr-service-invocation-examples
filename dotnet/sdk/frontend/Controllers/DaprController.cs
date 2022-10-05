using Microsoft.AspNetCore.Mvc;
using Microsoft.Net.Http.Headers;
using Dapr.Client;

namespace frontend.Controllers;

[ApiController]
[Route("api/[controller]")]
public class DaprController : ControllerBase{

    [HttpGet(Name = "Dapr")]
    public async Task<string> OnGetAsync()
    {
        var client = DaprClient.CreateInvokeHttpClient(appId: "backend");
        var response = await client.GetAsync("/api/weatherforecast");
        var contentStream = await response.Content.ReadAsStringAsync();
        return contentStream;
    }
}
