package acme.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Toolkit extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	@NotBlank
	@Column(unique=true)
	@Pattern(regexp = "^[A-Z]{3}-[0-9]{3}(-[A-Z])?$")
	protected String code;

	@NotBlank
	@Length(min=1, max=100)
	protected String title;
	
	@NotBlank
	@Length(min=1, max=255)
	protected String description;
	
	@NotBlank
	@Length(min=1, max=255)
	protected String assemblyNotes;
	
	@NotNull
	protected boolean publish;
	
	@URL
	protected String link;
	
	
	
	
	
	
}
