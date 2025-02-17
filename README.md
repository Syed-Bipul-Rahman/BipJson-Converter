# BipJson-Converter

[![GitHub License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/Syed-Bipul-Rahman/BipJson-Converter/blob/main/LICENSE)

BipJson-Converter is a desktop application developed in Java designed to generate model classes from JSON, enhancing efficiency and streamlining the development process. This tool is especially useful for developers who frequently work with JSON data structures and need to convert them into Java model classes quickly.

## Features

- **JSON to Java Model Conversion**: Easily generate Java model classes from JSON input.
- **User-Friendly Interface**: Simple and intuitive desktop application for seamless interaction.
- **Customizable Output**: Configure class names, field types, and other settings to match your project requirements.
- **Cross-Platform**: Built in Java, ensuring compatibility across different operating systems.

## Installation

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or higher installed on your system.
- **Git**: To clone the repository.

### Steps to Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Syed-Bipul-Rahman/BipJson-Converter.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd BipJson-Converter
   ```

3. **Build the Project**:
   If you're using an IDE like IntelliJ IDEA or Eclipse, simply import the project as a Maven/Gradle project (depending on the build system used). Alternatively, if you're building via the command line:

   - For Maven:
     ```bash
     mvn clean install
     ```
   - For Gradle:
     ```bash
     gradle build
     ```

4. **Run the Application**:
   After building the project, you can run the application using:
   ```bash
   java -jar target/BipJson-Converter.jar
   ```

## Usage

1. **Launch the Application**: Run the `.jar` file generated after building the project.
2. **Input JSON**: Paste your JSON data into the provided text area.
3. **Configure Settings**: Customize the output by setting class names, package names, and other options.
4. **Generate Models**: Click the "Generate" button to create Java model classes based on the JSON input.
5. **Export Code**: Save the generated Java code to your desired location.

## Contributing

We welcome contributions! If you'd like to contribute to BipJson-Converter, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeatureName`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeatureName`).
5. Open a pull request.

Please ensure that your code adheres to the existing coding style and includes appropriate tests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, feel free to reach out to the project maintainer:

- **Maintainer**: Syed Bipul Rahman
- **GitHub Profile**: [Syed-Bipul-Rahman](https://github.com/Syed-Bipul-Rahman)
- **Project URL**: [BipJson-Converter](https://github.com/Syed-Bipul-Rahman/BipJson-Converter)

---

Happy Coding! 🚀
