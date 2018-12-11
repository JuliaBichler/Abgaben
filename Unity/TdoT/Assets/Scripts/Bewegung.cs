using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Bewegung : MonoBehaviour {
	public float speed;
	public GameObject pfeil;
	public GameObject panzer;

	void Start()
	{
		
	}
	void Update()
	{
		if (Input.GetKey(KeyCode.LeftArrow))
		{
			
			Vector3 pos = transform.position;
			pos.x -= 1.5f * Time.deltaTime;
			transform.position=pos;

		}
		if (Input.GetKey(KeyCode.RightArrow))
		{
			Vector3 pos = transform.position;
			pos.x += 1.5f * Time.deltaTime;
			transform.position=pos;
		}

		pfeil.transform.position = panzer.transform.position;

		if (Input.GetKey(KeyCode.UpArrow))
		{

			pfeil.transform.Rotate (new Vector3 (0, 0, -1), 12f * Time.deltaTime);

		}
		if (Input.GetKey (KeyCode.DownArrow)) 
		{
			pfeil.transform.Rotate (new Vector3 (0, 0, 1), 12f * Time.deltaTime);
		}

	}
}
