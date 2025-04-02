# Contributing to JUNIX

Thank you for your interest in contributing to JUNIX! Your contribution help improve the project and make it more useful for everyone. :D

## How to contribute

### General Guidelines

- Ensure your contributions align with the project goals and style.
- Be respectful and constructive when engaging with other contributors.
- Keep commits atomic and well described.

## Getting Started

1. **Fork the repository** on GitHub.

2. **Clone your fork** to your local machine:
```bash
  git clone https://github.com/yourusername/junix.git
  cd junix
```

3. **Create a new branch** for your feature or fix.
```bash
   git checkout -b feature/amazing-feature
```
4. **Make your changes** following the coding conventions

5. **Run tests** to ensure your changes work correctly
```bash
   mvn test 
```

6. **Commit your changes** with a clear and descriptive message:

```bash
   git commit -m "Add amazing new feature" 
```

7. **Push your branch** to GitHub
```bash
   git push origin feature/amazing-feature 
```

8. **Open a Pull Request (PR)** from your branch to the main branch of the original repository

## Development Guidelines

### Coding Standards

- Follow Java coding conventions.

- Use meaningful variable and method names.

- Keep your code clean and well-structured.

- **Package Naming:** Use the package structure ```com.caresle.junix```.

- **Class Structure:** 

  - All commands and implementations must extend ```Command``` and override ```run()```.
  
  - Example:
  ```java 
    package com.caresle.junix;
    public class Ls extends Command {
        @Override
        public void run(){
            System.out.println("Executing ls command");
        }
    }
  ```
  - **Exception:** ```Mv``` does not extend ```Command``` as it follows a different structure.

### Argument Validation
- Ensure the correct number of arguments before executing a command.
- Example:
```java
if (args.length != 3){
    System.out.println("Please specify [originalpath] [destinyPath]");
    return;
}
```

### Standard Output and Error Handling
- Use ```System.out.println()``` for displaying messages.
- Use ```System.err.println()``` for error messages.

### Testing
- Write unit tests for new features.
- Ensure tests validate actual behavior and avoid placeholder assertions (e.g., ```assertTrue(true)``` should be replaced with meaningful assertions.
- Run all tests before submitting a PR.

### Documentation
- Update documentation if your changes impact the existing behavior.
- Ensure README.md and command documentation remain up tu date.

### Need Help?
If you have any questions, feel free to open an issue or reach out via GitHub Discussions.

**Happy coding!** :D