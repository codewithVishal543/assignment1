@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired private PatientRepository patientRepo;

    @PostMapping
    public Patient addPatient(@RequestBody @Valid Patient patient) {
        return patientRepo.save(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientRepo.deleteById(id);
    }
}
