package test.erdemo;

import java.io.Serializable;

/**
 * Model class of published_item.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class PublishedItem implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** PUBLISHED_ITEM. */
	private Integer id;

	/** name. */
	private String name;

	/** origin_price. */
	private Float originPrice;

	/** sell_price. */
	private Float sellPrice;

	/** status. */
	private String status;

	/** description. */
	private String description;

	/** picture. */
	private String picture;

	/** user. */
	private User user;

	/**
	 * Constructor.
	 */
	public PublishedItem() {
	}

	/**
	 * Set the PUBLISHED_ITEM.
	 * 
	 * @param id
	 *            PUBLISHED_ITEM
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the PUBLISHED_ITEM.
	 * 
	 * @return PUBLISHED_ITEM
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Set the name.
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the name.
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the origin_price.
	 * 
	 * @param originPrice
	 *            origin_price
	 */
	public void setOriginPrice(Float originPrice) {
		this.originPrice = originPrice;
	}

	/**
	 * Get the origin_price.
	 * 
	 * @return origin_price
	 */
	public Float getOriginPrice() {
		return this.originPrice;
	}

	/**
	 * Set the sell_price.
	 * 
	 * @param sellPrice
	 *            sell_price
	 */
	public void setSellPrice(Float sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * Get the sell_price.
	 * 
	 * @return sell_price
	 */
	public Float getSellPrice() {
		return this.sellPrice;
	}

	/**
	 * Set the status.
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Get the status.
	 * 
	 * @return status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * Set the description.
	 * 
	 * @param description
	 *            description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the description.
	 * 
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set the picture.
	 * 
	 * @param picture
	 *            picture
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * Get the picture.
	 * 
	 * @return picture
	 */
	public String getPicture() {
		return this.picture;
	}

	/**
	 * Set the user.
	 * 
	 * @param user
	 *            user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Get the user.
	 * 
	 * @return user
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PublishedItem other = (PublishedItem) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
