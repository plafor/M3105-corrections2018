package version5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Instrument> instruments;

	public Inventory() {
		instruments = new LinkedList<>();
	}

	public void addInstrument(Instrument newInstrument) {
		instruments.add(newInstrument);
	}

	public Instrument getInstrument(String serialNumber) {
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument anInstrument = i.next();
			if (anInstrument.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return anInstrument;
			}
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec searchInstrument) {

		List<Instrument> listInstruments = new LinkedList<>();

		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument oneInstrument = i.next();

			if (oneInstrument.getSpecs().matches(searchInstrument)) {
				listInstruments.add(oneInstrument);
			}
		}
		return listInstruments;
	}

}
