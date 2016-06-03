package me.bhargav;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import me.bhargavramreddysanagala.patient.Gender;
import me.bhargavramreddysanagala.patient.Patient;

public class JAXBRunTimeAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Run time API initiative
			JAXBContext context = JAXBContext.newInstance(Patient.class);
			
			//Marshaling an object to XML
			Marshaller mashller = context.createMarshaller();
			
			//Create Patient Object
			Patient patient = new Patient();
			patient.setId(111);
			patient.setName("Bhargav");
			patient.setAge(26);
			patient.setGender(Gender.M);
			patient.setPhone("9723135316");
			
			StringWriter writer = new StringWriter();
			mashller.marshal(patient, writer);
			
			System.out.println(writer.toString());
			
			//UnMarshaling XML to an Object
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Patient patientresult = (Patient) unmarshaller.unmarshal(new StringReader(writer.toString()));
			System.out.println(patientresult.getPhone());
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
