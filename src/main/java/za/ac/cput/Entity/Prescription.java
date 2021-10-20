/*  Prescription.java
    Entity for the Prescription
    Author: Sonwabile Gxoyiya (219267189)
    Date: 14 October 2021
 */

package za.ac.cput.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.net.*;
import java.io.*;

@Entity
public class Prescription implements Serializable{


    @Id
    private String prescriptionID;
    private String medicineID;
    private String medicineName;
    private String directions;
    private int dosage;
    private String prescriptionDate;
    private String reason;

    private Prescription() {}

    private Prescription(Builder builder){
        this.prescriptionID = builder.prescriptionID;
        this.prescriptionDate = builder.prescriptionDate;
        this.medicineID = builder.medicineID;
        this.medicineName = builder.medicineName;
        this.directions = builder.directions;
        this.dosage = builder.dosage;
        this.reason = builder.reason;
    }

    public static class Builder{
        private String prescriptionID;
        private String medicineID;
        private String medicineName;
        private String directions;
        private int dosage;
        private String prescriptionDate;
        private String reason;

        public Builder setPrescriptionID(String prescriptionID){
            this.prescriptionID = prescriptionID;
            return this;
        }

        public Builder setMedicineID(String medicineID){
            this.medicineID = medicineID;
            return this;
        }

        public Builder setMedicineName(String medicineName){
            this.medicineName = medicineName;
            return this;
        }

        public Builder setDirections(String directions){
            this.directions = directions;
            return this;
        }

        public Builder setPrescriptionDate(String prescriptionDate){
            this.prescriptionDate = prescriptionDate;
            return this;
        }

        public Builder setReason(String reason){
            this.reason = reason;
            return this;
        }

        public Builder setDosage(int dosage){
            this.dosage = dosage;
            return this;
        }

        public Prescription build(){
            return new Prescription(this);
        }

        public Builder copy(Prescription prescription){
            this.prescriptionID = prescription.prescriptionID;
            this.medicineID = prescription.medicineID;
            this.medicineName = prescription.medicineName;
            this.directions = prescription.directions;
            this.dosage = prescription.dosage;
            this.prescriptionDate = prescription.prescriptionDate;
            this.reason = prescription.reason;
            return this;
        }

    }



    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionID=" + prescriptionID +
                ", medicineID=" + medicineID +
                ", medicineName='" + medicineName + '\'' +
                ", directions='" + directions + '\'' +
                ", dosage=" + dosage +
                ", prescriptionDate='" + prescriptionDate + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}

