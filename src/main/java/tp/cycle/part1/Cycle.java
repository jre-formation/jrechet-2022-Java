package tp.cycle.part1;

import java.time.LocalDate;

public abstract class Cycle {
	private LocalDate dateAchat;
	private String marque;
	private String modele;

	public Cycle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de cycle
	 * 
	 * @param dateAchat date d'achat du cycle
	 * @param marque    marque du cycle
	 * @param modele    mod?le du cycle
	 */
	public Cycle(LocalDate dateAchat, String marque, String modele) {
		this.dateAchat = dateAchat;
		this.marque = marque;
		this.modele = modele;
	}

	/**
	 * Calcule l'?ge du cycle en fonction de sa date d'achat
	 * 
	 * @return l'?ge du cycle
	 */
	public int age() {
		return dateAchat.until(LocalDate.now()).getYears();
	}

	/**
	 * Indique le tarif de location pour une heure
	 * 
	 * @return le tarif de location pour une heure
	 */
	public abstract double getTarifLocationHeure();

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		int age = this.age();
		return String.format("%s %s %s (%dan%s)", this.getClass().getSimpleName(), this.marque, this.modele, age,
				age > 1 ? "s" : "");
	}
}