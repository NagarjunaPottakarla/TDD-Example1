import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.PopulationSearch;

public class PopulationSearchTest {

	private PopulationSearch ps;

	@Before
	public void setup() {
		ps = new PopulationSearch();
	}
	@Test
	public void findPopulation() {
		String city = "Bangalore";
		int expectedPopulation = 200000;
		// PopulationSearch ps=new PopulationSearch();
		int count = ps.getPopulation(city);
		Assert.assertEquals(expectedPopulation, count);
	}

	@Test(expected = NullPointerException.class)
	public void findPopulationEmptyInput() {
		String city = "";
		int expectedPopulation = 0;
		// PopulationSearch ps=new PopulationSearch();
		int count = ps.getPopulation(city);
		Assert.assertEquals(expectedPopulation, count);
	}
	@Test(expected = NullPointerException.class)
	public void findPopulationInvalidInput() {
		String city = "xyz";
		int expectedPopulation = 0;
		// PopulationSearch ps=new PopulationSearch();
		int count = ps.getPopulation(city);
		Assert.assertEquals(expectedPopulation, count);
	}
}
