# jsonic-viewer

## Table of Contents
1. Introduction
2. Features
3. Road Map
4. Installation
5. How It Works
6. Contributing
7. License


[![Build Status](https://app.travis-ci.com/ISmillex/jsonic-viewer.svg?token=uDzAnadwv18ksKUWLqZ3&branch=main)](https://app.travis-ci.com/ISmillex/jsonic-viewer)

[Jsonic Viewer](https://jsonic-viewer.icywater-4ddd2155.uksouth.azurecontainerapps.io)

## Introduction
The **jsonic-viewer** is a JSON parser-viewer. It uses the Spring framework for backend operations, Jsonic for parsing, Htmx for the frontend, and Junit for testing. The tool is designed for quick and simple JSON data handling and is available for use here.

## Features
- **Fast JSON Parsing**: Uses Jsonic for quick JSON string interpretation.
- **No External Dependencies**: Jsonic parser works without additional libraries.
- **Interactive Frontend**: Uses Htmx for a responsive user interface.
- **Thorough Testing**: Includes Junit tests for reliability.

## Road Map
- **Current Version**: Offers core parsing and viewing with a basic UI.
- **Upcoming Updates**: Plans for UI improvements, performance boosts, and more features for the Jsonic parser.

## Installation
Follow these steps to run the jsonic-viewer locally:
1. Clone the repository: `git clone https://github.com/ISmillex/jsonic-viewer.git`
2. Enter the project directory: `cd jsonic-viewer`
3. Install dependencies: `./mvnw install`
4. Start the application: `./mvnw spring-boot:run`

## How It Works
The jsonic-viewer processes JSON data by:
1. Parsing the input JSON string with the Jsonic parser.
2. Creating a `JValue` structure, with subclasses like `JNumber`, `JString`, `JObject`, `JArray`, and `JLiteral`.
3. Building a `Tree` from `TreeNodes` for a visual representation of the JSON object.
4. Recursively traversing the `Tree` to display the parsed data.

**Advantages**:
- Simplifies JSON data handling.
- Reduces code complexity.

**Disadvantages**:
- Limited to the features of the Jsonic parser.

## Contributing
Developers are welcome to contribute. Please fork the repository, make changes, and submit a pull request.

## License
The jsonic-viewer is released under the MIT License. For more details, see the LICENSE file.
