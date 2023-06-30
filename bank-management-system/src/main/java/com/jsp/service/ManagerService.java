package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.ManagerDao;
import com.jsp.dao.PersonDao;
import com.jsp.dto.Manager;
import com.jsp.dto.Person;

public class ManagerService {
	ManagerDao managerDao = new ManagerDao();
	PersonSerivce personSerivce = new PersonSerivce();
	public List<Person> viewAllPerson;

	public List<Person> viewAllPerson() {
		return personSerivce.getAllPerson();
	}

	public Manager saveManager(Manager manager) {
		if (manager != null) {
			return managerDao.saveManager(manager);
		} else {
			return null;
		}

	}

	public Manager updateManager(int manager_id, Manager manager) {
		if (manager_id > 0 && manager != null) {
			return managerDao.updateManager(manager_id, manager);

		} else {
			return null;

		}
	}

	public List<Manager> getAllManagers() {
		return managerDao.getAllManagers();

	}

	public boolean deleteManagerById(int id) {
		if (id > 0) {
			return managerDao.deleteManagerById(id);
		} else {
			return false;
		}
	}

	public boolean saveMultipleManager(List<Manager> managers) {
		if (!managers.isEmpty()) {
			return managerDao.saveMultipleManager(managers);
		} else {
			return false;
		}
	}

	public Manager getManagerById(int id) {
		if (id > 0) {
			return managerDao.getManagerById(id);
		} else {
			return null;
		}
	}

	public Manager approvePersonById(int person_id, int manager_id) {

		if (person_id > 0 && manager_id > 0) {
			Manager bm = getManagerById(manager_id);
			Person p = personSerivce.getPersonById(person_id);
			if (person_id > 0 && bm != null && p.getPan() != null && p.getStatus().equalsIgnoreCase("UnApproved")) {
				p.setStatus("Approved");
				personSerivce.updatePersonById(person_id, p);
				return bm;
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	public List<Person> viewAllUnApprovedPerson() {
		List<Person> unApprovedPersons = new ArrayList<>();
		List<Person> persons = personSerivce.getAllPerson();

		if (!persons.isEmpty()) {
			for (Person p : persons) {
				if (p.getStatus().equalsIgnoreCase("UnApproved")) {
					unApprovedPersons.add(p);
				}
			}
		} else {
			return null;
		}
		return unApprovedPersons;
	}

	public List<Person> viewAllApprovedPerson() {
		List<Person> approvedPersons = new ArrayList<>();
		List<Person> persons = personSerivce.getAllPerson();

		if (!persons.isEmpty()) {
			for (Person p : persons) {
				if (p.getStatus().equalsIgnoreCase("Approved")) {
					approvedPersons.add(p);
				}
			}
		} else {
			return null;
		}
		return approvedPersons;
	}
}
