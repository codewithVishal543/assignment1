@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired private DoctorRepository doctorRepo;

    @PostMapping
    public Doctor addDoctor(@RequestBody @Valid Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorRepo.deleteById(id);
    }
}
