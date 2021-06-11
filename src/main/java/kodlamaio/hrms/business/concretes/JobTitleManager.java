package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleRepository;
import kodlamaio.hrms.entities.concretes.JobTitle;

public class JobTitleManager implements JobTitleService {
	
	private JobTitleRepository jobTitleRepository;
	
	
	@Autowired
	public JobTitleManager(JobTitleRepository jobTitleRepository) {
		super();
		this.jobTitleRepository = jobTitleRepository;
	}



	@Override
	public List<JobTitle> getAll() {
		return this.jobTitleRepository.findAll();
	}

}
