
import java.util.Date;
import java.util.UUID;

public class CoffeeBlockchainSmiulastion {

  public static void main(String[] args) {
    

// Represents a single data point collected from sensors at a specific phase/location
class SensorData {
  String location;   // Physical/logistical location (e.g., origin, port, warehouse)
  String timestamp;   // Time when the data was captured
  String quality;    // Quality grade of the coffee beans
  String environment;  // Environmental metrics (e.g., humidity)
  String hash;     // Simulated unique hash to mimic blockchain immutability

  // Constructor initializes fields and simulates a hash for integrity
  public SensorData(String location, String quality, String environment) {
    this.location = location;
    this.timestamp = new Date().toString();
   // Capture the creation time
    this.quality = quality;
    this.environment = environment;
    this.hash = UUID.randomUUID().toString();  // Pseudo "block" identifier
  }

  // Prints a human-readable snapshot of the sensor record
  public void display() {
    System.out.println("Location: " + location);
    System.out.println(" Timestamp: " + timestamp);
    System.out.println(" Quality: " + quality);
    System.out.println(" Environment: " + environment);
    System.out.println(" Hash: " + hash);
  }
}

// Models a simplified smart contract with a milestone and a trigger condition
class SmartContract {
  String milestone;  // Business process milestone (e.g., customs clearance)
  boolean triggered; // Flag indicating whether the contract has been fired

  public SmartContract(String milestone) {
    this.milestone = milestone;
    this.triggered = false; // Initial state: not triggered
  }

  // Triggers the contract if a valid input is provided
  public void trigger(String input) {
    // Use logical AND (&&) to check both conditions; input must be non-null and non-empty
    if (input != null && !input.isEmpty()) {
      triggered = true;
      System.out.println(" Smart Contract triggered for: " + milestone);
    }
  }
}

// Captures governance-related actions for auditability and compliance
class GovernanceEvent {
  String event;   // Description of the governance action (e.g., permission granted)
  String actor;   // Who performed the action (role or identity)
  String timestamp; // When the event occurred

  public GovernanceEvent(String event, String actor) {
    this.event = event;
    this.actor = actor;
    this.timestamp = new Date().toString(); // Log the time of the governance action
  }

  // Outputs a compliant audit log entry
  public void log() {
    System.out.println("Governance Event: " + event + " by " + actor + " at " + timestamp);
  }
}

// Orchestrates the end-to-end simulation across data, logic (smart contracts), and governance layers

    System.out.println("=== Specialty Coffee Blockchain Simulation ===");

    // --- Data Layer Simulation ---
    // Represents sensor readings at critical points in the supply chain
    SensorData originData = new SensorData("Ethiopia Cooperative", "Grade A", "Humidity: 60%");
    SensorData portData = new SensorData("Djibouti Port", "Grade A", "Humidity: 55%");
    SensorData warehouseData = new SensorData("Dubai Warehouse", "Grade A", "Humidity: 50%");

    System.out.println("\n--- Data Layer ---");
    originData.display();   // Verify origin sensor record
    portData.display();    // Verify port sensor record
    warehouseData.display(); // Verify warehouse sensor record

    // --- Logic Layer Simulation ---
    // Smart contracts represent automated business rules tied to milestones
    SmartContract customsClearance = new SmartContract("Customs Clearance");
    SmartContract insuranceValidation = new SmartContract("Insurance Validation");
    SmartContract warehouseReceipt = new SmartContract("Warehouse Receipt");

    System.out.println("\n--- Logic Layer ---");
    // Triggering each contract simulates successful completion of its milestone
    customsClearance.trigger("Cleared");   // Input acts as a proof/flag for condition
    insuranceValidation.trigger("Validated");
    warehouseReceipt.trigger("Received");

    
// --- Governance Layer Simulation ---
    // Governance events capture permissions, disputes, and contract amendments
    GovernanceEvent permissionGranted = new GovernanceEvent("Permission Granted", "Consortium Admin");
    GovernanceEvent disputeResolved = new GovernanceEvent("Dispute Resolved", "Arbitrator");
    GovernanceEvent contractUpdated = new GovernanceEvent("Contract Amended", "Legal Team");

    System.out.println("\n--- Governance Layer ---");
    permissionGranted.log(); // Auditable trace of permissioning
    disputeResolved.log();  // Auditable trace of dispute resolution
    contractUpdated.log();  // Auditable trace of contract change

    // Final output indicating the simulated workflow is complete
    System.out.println("\n Simulation Complete: Verifiable Farm-to-Cup Journey Established.");
  }
}
