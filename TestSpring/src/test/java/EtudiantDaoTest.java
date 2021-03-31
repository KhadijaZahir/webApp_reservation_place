import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.example.dao.EtudiantDao;
import org.example.dao.EtudiantDaoImp;
import org.example.model.Etudiant;
import org.example.service.EtudiantService;
import org.example.service.EtudiantServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EtudiantDaoTest {

	private static Etudiant dadi;
	
	private static EtudiantDao etudiantDao;
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void init() throws Exception {
		dadi = new Etudiant("Salim", new Date(), "S@gmail.com", "phptp-salim");
		etudiantDao = new EtudiantDaoImp();
		System.out.println("set Up Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tear Down After Class");
	}

	

	@Before
	public void setUp() throws Exception {
		System.out.println("set Up");
		
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tear Down");
	}
	
	@Test
	public void testCeateEtudiant() throws ClassNotFoundException, SQLException {
		

		//etudiantService.save(dadi);
		
//		EtudiantDao etudiantdao = new EtudiantDaoImp();
//		etudiantdao.createEtudiant(dadi);
		
		
		Etudiant karim = new Etudiant("Salim", new Date(), "S@gmail.com", "phptp-salim");
		
		List<Etudiant> etudiants = etudiantDao.getAll();
		
		System.out.println(etudiants.get(2).getNom());
		
		
		assertEquals("les deux personnes doivent etre égaux",karim.getNom(), etudiants.get(5).getNom());
		
		System.out.println("Etudiant : "+etudiants.get(2).getNom());
	}
	
	@Test
	public void getById() throws ClassNotFoundException, SQLException {
		EtudiantDao etudiantdao = new EtudiantDaoImp();
		Etudiant etudiant = etudiantdao.getById(1L);
		Etudiant ka = new Etudiant();
		ka.setNom("kamal");
		assertEquals("les deux personnes doivent etre égaux",ka.getNom(), etudiant.getNom());
	}

}
