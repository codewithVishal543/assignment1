@RestController
@RequestMapping("/suggestions")
public class SuggestionController {
    @Autowired private SuggestionService suggestionService;

    @GetMapping("/{patientId}")
    public Object suggest(@PathVariable Long patientId) {
        return suggestionService.suggestDoctors(patientId);
    }
}
