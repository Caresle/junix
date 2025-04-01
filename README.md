# JUNIX

A simple cli with some linux-like commands made using Java.

## Table of contents

- [List of commands](#list-of-commands)
- [Getting started](#getting-started)
- [Contributing](#contributing)

## List of commands

Here is a list of the commands of the cli:

- [ ] ls - List directory contents
- [ ] ifconfig - Display network interface configuration
- [ ] mv - Move (rename) files

## Getting started

### Prerequisites

- Java 17 or higher
- Maven 3.6.x or higher

### Installation

1. Clone the repository

```bash
git clone https://github.com/yourusername/junix.git
cd junix
```

2. Build the project

```bash
mvn clean package
```

3. Run the application

```bash
java -jar target/junix-1.0-SNAPSHOT.jar
```

## Contributing

We welcome contributions to JUNIX! Here's how you can help:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/amazing-feature`)
3. Make your changes
4. Run tests to ensure everything works

```bash
mvn test
```

5. Commit your changes (`git commit -m 'Add some amazing feature'`)
6. Push to the branch (`git push origin feature/amazing-feature`)
7. Open a Pull Request

### Development Guidelines

- Follow Java coding conventions
- Write unit tests for new features
- Update documentation as needed
- Keep commits atomic and well-described

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
