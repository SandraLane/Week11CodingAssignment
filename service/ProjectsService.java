package projects.service;

import java.util.List;


import projects.dao.ProjectsDao;
import projects.entity.Project;


public class ProjectsService {
	
	
	private ProjectsDao projectsDao = new ProjectsDao();
	
	public Project addProject(Project projects) {
		return projectsDao.insertProject(projects);
		
	}

	public List<Project> fetchAllProjects() {
		return projectsDao.fetchAllProjects();
	}

	
}
