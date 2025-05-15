@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI().info(new Info()
            .title("Doctor Suggestion API")
            .version("1.0")
            .description("APIs for managing doctors and patients"));
    }
}
