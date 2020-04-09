package com.bit.mesra.service;

import java.util.ArrayList;
import java.util.List;

public class BITMesraService {
	
	public List<String> getAllStudents() {
		List<String> mesraStudents = new ArrayList<>();
		mesraStudents.add("Vaishali S");
		mesraStudents.add("Prachi B");
		mesraStudents.add("Rohini C");

		return mesraStudents;

	}

	public List<String> getAllProfessors() {
		List<String> mesraProfessors = new ArrayList<>();
		mesraProfessors.add("Madhup Kumar");
		mesraProfessors.add("Ayan Das");
		mesraProfessors.add("K Lal");
		return mesraProfessors;

	}

}
