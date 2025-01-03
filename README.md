# KaleidoPipelines

A modular and extensible pipeline processing system designed to handle different types of data processing pipelines with partner-specific implementations.

## Project Structure

```
kaleidoPipelines/
├── src/main/java/com/bytecoder/kaleidopipelines/
│   ├── controller/
│   │   ├── PipelineController.java       # REST endpoints
│   │   ├── HealthController.java         # Health check endpoint
│   │   ├── Pipeline.java                 # Pipeline interface
│   │   └── KaleidoPipelineFactory.java   # Factory for creating pipelines
│   ├── kiscorepipeline/
│   │   ├── pipeline/
│   │   │   └── KiscorePipeline.java      # Kiscore pipeline implementation
│   │   └── featurecreation/
│   │       ├── FeatureCreation.java      # Base feature creation
│   │       └── partners/
│   │           ├── sonata/               # Sonata-specific features
│   │           └── veritas/              # Veritas-specific features
│   └── kiviewpipeline/
│       ├── KiViewPipeline.java           # KiView pipeline implementation
│       ├── base/
│       │   ├── DefaultIngestionPipeline.java
│       │   └── DefaultRiskPipeline.java
│       └── partners/
│           ├── sonata/                   # Sonata-specific pipelines
│           └── veritas/                  # Veritas-specific pipelines
```

## Design Patterns

1. **Factory Pattern**
   - `KaleidoPipelineFactory`: Creates appropriate pipeline instances based on type
   - `FeatureFactory`: Creates partner-specific features
   - Enables easy addition of new pipeline types and features

2. **Strategy Pattern**
   - Different pipeline implementations (KiView, Kiscore)
   - Partner-specific implementations for each pipeline type
   - Allows switching between different algorithms/implementations

3. **Template Method Pattern**
   - Base pipeline classes define the skeleton
   - Partner-specific classes override specific methods
   - Ensures consistent pipeline execution flow

4. **Command Pattern**
   - Pipeline execution commands encapsulate all necessary information
   - Enables queuing and execution of pipeline operations

## Request Flow

1. **API Entry Point**
   ```
   POST /pipeline/execute
   Body: ["PIPELINE_TYPE", "PARTNER", "OPERATION", "LOAD_TYPE"]
   ```

2. **Request Processing**
   ```
   Client Request
        ↓
   PipelineController
        ↓
   KaleidoPipelineFactory
        ↓
   Specific Pipeline (KiView/Kiscore)
        ↓
   Partner-Specific Implementation
   ```

3. **Example Flows**:

   a. KiView Pipeline:
   ```
   ["KIVIEW", "SONATA", "INGESTION", "ONETIME_LOAD"]
   → KiViewPipeline
   → SonataIngestionPipeline.executeOneTimeLoad()
   ```

   b. Kiscore Pipeline:
   ```
   ["KISCORE", "VERITAS", "MFI"]
   → KiscorePipeline
   → VeritasMFIFeatures.create()
   ```

## Pipeline Types

1. **KiView Pipeline**
   - **Operations**: INGESTION, RISK
   - **Load Types**: ONETIME_LOAD, INCREMENTAL_LOAD
   - Handles data ingestion and risk assessment

2. **Kiscore Pipeline**
   - **Features**: MFI, SME, CONSUMER
   - Handles feature creation and scoring

## Partner Implementation

1. **Sonata**
   - Custom ingestion logic
   - Partner-specific risk calculations
   - Specialized feature creation

2. **Veritas**
   - Custom data transformation
   - Partner-specific risk models
   - Specialized scoring algorithms

## Adding New Partners

1. Create partner-specific package under respective pipeline
2. Implement required pipeline classes extending base classes
3. Override necessary methods with partner-specific logic

## Adding New Pipeline Types

1. Create new pipeline package
2. Implement Pipeline interface
3. Add to KaleidoPipelineFactory
4. Create necessary base and partner-specific implementations

## Usage Examples

```bash
# Sonata KiView Ingestion - One-time Load
curl -X POST "http://localhost:8080/pipeline/execute" \
     -H "Content-Type: application/json" \
     -d '["KIVIEW", "SONATA", "INGESTION", "ONETIME_LOAD"]'

# Veritas Kiscore Feature Creation
curl -X POST "http://localhost:8080/pipeline/execute" \
     -H "Content-Type: application/json" \
     -d '["KISCORE", "VERITAS", "MFI"]'
```

## Dependencies

- Java 21
- Spring Boot 3.2.1
- Maven for build management
- SLF4J for logging

## Getting Started

1. Clone the repository
2. Build using Maven: `mvn clean install`
3. Run the application: `mvn spring-boot:run`
4. Access the API at `http://localhost:8080`
