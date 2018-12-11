using System;

namespace AssemblyCSharp
{
	public class Camera
	{
		private Transform player;
		private new Transform transform;
		private float _sreferredOrthographicSize;
		private float _targetOrthographicSize;
		private float _maxOrthographicSize;
		private float _neutralVerticalOffset=0;

		private float zoom { get { return _sreferredOrthographicSize / _camera.orthograpicSize; } }
		private DigitalAverage _heightAverage = new DigitalAverage();
		private bool _pinnedToTop = false;
		private PlayerControler _playerController;

		void Start()
		{
			_camera = Camera.main;
			transform = _camera.transform;
			_preferredOrthographicSize = Screen.height / 2;
			_maxOrthographicSize = _preferredOrthographicSize * 2;
			_camera.orthographicSize = _preferredOrthographicSize;

			_playerController = player.GetComponent<PlayerControler> ();
		}
	}
}

